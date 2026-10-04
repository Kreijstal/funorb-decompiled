/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class UiWidget extends IntrusiveNode {
    int widgetHeight;
    int widgetWidth;
    TextLayout textLayout;
    int widgetY;
    boolean pointerInside;
    String widgetText;
    static int completedThemeCount;
    WidgetRenderer renderer;
    int widgetX;
    int pressedPointerButton;
    int textOffsetX;
    int textOffsetY;
    WidgetListener listener;
    String hoverText;
    static IntrusiveDeque pendingByteShortQueries;
    static int gameplayReturnScreenId;
    static GameplaySession gameplaySession;
    static int achievementTrackingAccumulator;

    final boolean dispatchKeyInputOrRequestFocus(byte methodGuard, char typedCharacter, int keyCode) {
        int guardQuotient = 0;
        int keyCodeSnapshot = 0;
        if (!this.hasKeyboardFocus((byte) 54)) {
            guardQuotient = 71 / ((methodGuard + 40) / 63);
            keyCodeSnapshot = keyCode;
            if (keyCodeSnapshot != 80) {
                return false;
            }
            return this.requestKeyboardFocus((byte) -75, (UiWidget) (this));
        }
        if (this.handleKeyInput(keyCode, 13, typedCharacter, (UiWidget) (this))) {
            return true;
        }
        guardQuotient = 71 / ((methodGuard + 40) / 63);
        keyCodeSnapshot = keyCode;
        if (keyCodeSnapshot != 80) {
            return false;
        }
        return this.requestKeyboardFocus((byte) -75, (UiWidget) (this));
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != -5927) {
            return;
        }
        gameplaySession = null;
        pendingByteShortQueries = null;
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int guardResidue = 0;
        if (renderPass != 0) {
            guardResidue = 35 % ((1 - methodGuard) / 43);
            return;
        }
        if (null != this.renderer) {
            this.renderer.drawWidget(parentX, -81, parentY, true, (UiWidget) (this));
            guardResidue = 35 % ((1 - methodGuard) / 43);
            return;
        }
        guardResidue = 35 % ((1 - methodGuard) / 43);
    }

    int getLastRenderPass(byte methodGuard) {
        if (methodGuard < 82) {
            pendingByteShortQueries = (IntrusiveDeque) null;
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return this.appendWidgetDiagnostics(0, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyInputFailure = null;
        RuntimeException keyFailureForContext = null;
        StringBuilder keyContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (methodGuard == 13) {
            return false;
          }
          this.listener = (WidgetListener) null;
          return false;
        } catch (java.lang.RuntimeException keyFailure) {
          caughtKeyFailure = keyFailure;
          keyInputFailure = caughtKeyFailure;
          keyFailureForContext = keyInputFailure;
          keyContextBuilder = new StringBuilder().append("el.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureForContext), ((StringBuilder) (Object) keyContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int pointerInsideFlag = 0;
        int currentPointerInsideFlag = 0;
        int invertedPreviousPointerInsideFlag = 0;
        boolean newPointerInside = false;
        RuntimeException pointerFailureBeforeContext = null;
        StringBuilder pointerFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerUpdateException = null;
        RuntimeException pointerUpdateFailure = null;
        try {
          if (hoverGuard) {
            return;
          }
          pointerInsideFlag = this.containsPointer(PrefixCodeDecoder.pointerXSnapshot, -1, PcmResampler.pointerYSnapshot, parentY, parentX) ? 1 : 0;
          currentPointerInsideFlag = pointerInsideFlag;
          if (this.pointerInside) {
            invertedPreviousPointerInsideFlag = 0;
          } else {
            invertedPreviousPointerInsideFlag = 1;
          }
          if (currentPointerInsideFlag == invertedPreviousPointerInsideFlag) {
            if (pointerInsideFlag == 0) {
              newPointerInside = false;
            } else {
              newPointerInside = true;
            }
            ((UiWidget) (this)).pointerInside = newPointerInside;
            if (this.listener != null) {
              if (!(this.listener instanceof PointerHoverListener)) {
                return;
              }
              ((PointerHoverListener) ((Object) this.listener)).onPointerInsideChanged(53, (UiWidget) (this), pointerInsideFlag != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtPointerUpdateFailure) {
          caughtPointerUpdateException = caughtPointerUpdateFailure;
          pointerUpdateFailure = caughtPointerUpdateException;
          pointerFailureBeforeContext = pointerUpdateFailure;
          pointerFailureContextBuilder = new StringBuilder().append("el.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerFailureBeforeContext), ((StringBuilder) (Object) pointerFailureContextBuilder).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    final boolean containsPointer(int pointerX, int methodGuard, int pointerY, int parentY, int parentX) {
        if (methodGuard != -1) {
            return true;
        }
        if (pointerX < this.widgetX + parentX) {
            return false;
        }
        if (pointerY < this.widgetY + parentY) {
            return false;
        }
        if (pointerX >= parentX + this.widgetX + this.widgetWidth) {
            return false;
        }
        if (this.widgetHeight + (this.widgetY + parentY) > pointerY) {
            return true;
        }
        return false;
    }

    UiWidget(String text, WidgetListener listener) {
        this(text, DialRenderer.field_j.field_b, listener);
    }

    boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException focusRequestFailure = null;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        try {
          if (methodGuard <= -30) {
            return false;
          }
          this.handlePointerWheel(-77, -17, -47, -88, 79, (UiWidget) null, 49);
          return false;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          focusRequestFailure = caughtFocusFailure;
          focusFailureForContext = focusRequestFailure;
          focusContextBuilder = new StringBuilder().append("el.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(')').toString());
        }
    }

    final boolean processPointerFrame(boolean pointerEventsAvailable, int methodGuard, int parentX, int parentY) {
        int focusFlag;
        DraggableWidget releasedDragWidgetAlias;
        int clientControlFlowSnapshot;
        DraggableWidget releasedDragWithoutPressOrWheel;
        DraggableWidget releasedDragAfterRejectedPressWithoutFocusOrWheel;
        DraggableWidget releasedDragAfterPressWithoutWheel;
        DraggableWidget releasedDragWithoutFocusOrPress;
        DraggableWidget releasedDragAfterRejectedPressWithoutFocus;
        DraggableWidget releasedDragAfterPressWithoutFocus;
        DraggableWidget releasedDragWithWheelAndNoPress;
        DraggableWidget releasedDragAfterRejectedPressWithWheel;
        DraggableWidget releasedDragAfterPressWithWheel;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= 126) {
          return true;
        }
        this.updatePointerState(false, parentY, (UiWidget) (this), parentX);
        focusFlag = this.hasKeyboardFocus((byte) 54) ? 1 : 0;
        if (!pointerEventsAvailable) {
          if ((focusFlag != 0) &&
              (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
            this.clearKeyboardFocus(-126);
          }
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == CachedTextLayout.wheelRotationSnapshot) {
          if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
            if ((EntityCollisionSupport.heldPointerButtonSnapshot == 0) &&
                (0 != FullscreenErrorDialog.previousUiPointerButton)) {
              this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
              releasedDragWithoutPressOrWheel = ValidationState.activeDragWidget;
              if (releasedDragWithoutPressOrWheel != null) {
                if (releasedDragWithoutPressOrWheel.listener instanceof DropListener) {
                  ((DropListener) ((Object) releasedDragWithoutPressOrWheel.listener)).onDrop((DropTargetWidget) null, releasedDragWithoutPressOrWheel, 22176);
                }
                ValidationState.activeDragWidget = null;
              }
              if ((clientControlFlowSnapshot != 0) &&
                  (focusFlag != 0) &&
                  (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
                this.clearKeyboardFocus(-126);
              }
            }
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          pointerPressWithoutWheel: {
            if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, AccountCreationSupport.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
              if (focusFlag == 0) {
                if ((EntityCollisionSupport.heldPointerButtonSnapshot == 0) &&
                    (0 != FullscreenErrorDialog.previousUiPointerButton)) {
                  this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
                  releasedDragAfterRejectedPressWithoutFocusOrWheel = ValidationState.activeDragWidget;
                  if (releasedDragAfterRejectedPressWithoutFocusOrWheel != null) {
                    if (releasedDragAfterRejectedPressWithoutFocusOrWheel.listener instanceof DropListener) {
                      ((DropListener) ((Object) releasedDragAfterRejectedPressWithoutFocusOrWheel.listener)).onDrop((DropTargetWidget) null, releasedDragAfterRejectedPressWithoutFocusOrWheel, 22176);
                    }
                    ValidationState.activeDragWidget = null;
                  }
                  if ((clientControlFlowSnapshot != 0) &&
                      (focusFlag != 0) &&
                      (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
                    this.clearKeyboardFocus(-126);
                  }
                }
                FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
                ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
                return pointerEventsAvailable;
              }
              this.clearKeyboardFocus(-127);
              if (clientControlFlowSnapshot == 0) {
                break pointerPressWithoutWheel;
              }
            }
            pointerEventsAvailable = false;
          }
          if (EntityCollisionSupport.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
          releasedDragAfterPressWithoutWheel = ValidationState.activeDragWidget;
          if (releasedDragAfterPressWithoutWheel != null) {
            if (releasedDragAfterPressWithoutWheel.listener instanceof DropListener) {
              ((DropListener) ((Object) releasedDragAfterPressWithoutWheel.listener)).onDrop((DropTargetWidget) null, releasedDragAfterPressWithoutWheel, 22176);
            }
            ValidationState.activeDragWidget = null;
          }
          if ((clientControlFlowSnapshot != 0) &&
              (focusFlag != 0) &&
              (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
            this.clearKeyboardFocus(-126);
          }
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (focusFlag != 0) {
          this.handlePointerWheel(parentY, CachedTextLayout.wheelRotationSnapshot, parentX, -1, PrefixCodeDecoder.pointerXSnapshot, (UiWidget) (this), PcmResampler.pointerYSnapshot);
          if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
            if ((EntityCollisionSupport.heldPointerButtonSnapshot == 0) &&
                (0 != FullscreenErrorDialog.previousUiPointerButton)) {
              this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
              releasedDragWithWheelAndNoPress = ValidationState.activeDragWidget;
              releasedDragWidgetAlias = releasedDragWithWheelAndNoPress;
              if (releasedDragWithWheelAndNoPress != null) {
                if (releasedDragWithWheelAndNoPress.listener instanceof DropListener) {
                  ((DropListener) ((Object) releasedDragWithWheelAndNoPress.listener)).onDrop((DropTargetWidget) null, releasedDragWithWheelAndNoPress, 22176);
                }
                ValidationState.activeDragWidget = null;
              }
              if ((clientControlFlowSnapshot != 0) &&
                  (focusFlag != 0) &&
                  (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
                this.clearKeyboardFocus(-126);
              }
            }
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          pointerPressWithWheel: {
            if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, AccountCreationSupport.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
              this.clearKeyboardFocus(-127);
              if (clientControlFlowSnapshot == 0) {
                break pointerPressWithWheel;
              }
            }
            pointerEventsAvailable = false;
          }
          if (EntityCollisionSupport.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
          releasedDragAfterPressWithWheel = ValidationState.activeDragWidget;
          releasedDragWidgetAlias = releasedDragAfterPressWithWheel;
          if (releasedDragAfterPressWithWheel != null) {
            if (releasedDragAfterPressWithWheel.listener instanceof DropListener) {
              ((DropListener) ((Object) releasedDragAfterPressWithWheel.listener)).onDrop((DropTargetWidget) null, releasedDragAfterPressWithWheel, 22176);
            }
            ValidationState.activeDragWidget = null;
          }
          if ((clientControlFlowSnapshot != 0) &&
              (focusFlag != 0) &&
              (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
            this.clearKeyboardFocus(-126);
          }
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
          if ((EntityCollisionSupport.heldPointerButtonSnapshot == 0) &&
              (0 != FullscreenErrorDialog.previousUiPointerButton)) {
            this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
            releasedDragWithoutFocusOrPress = ValidationState.activeDragWidget;
            if (releasedDragWithoutFocusOrPress != null) {
              if (releasedDragWithoutFocusOrPress.listener instanceof DropListener) {
                ((DropListener) ((Object) releasedDragWithoutFocusOrPress.listener)).onDrop((DropTargetWidget) null, releasedDragWithoutFocusOrPress, 22176);
              }
              ValidationState.activeDragWidget = null;
            }
            if ((clientControlFlowSnapshot != 0) &&
                (focusFlag != 0) &&
                (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
              this.clearKeyboardFocus(-126);
            }
          }
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, AccountCreationSupport.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
          if (EntityCollisionSupport.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
          releasedDragAfterRejectedPressWithoutFocus = ValidationState.activeDragWidget;
          releasedDragWidgetAlias = releasedDragAfterRejectedPressWithoutFocus;
          if (releasedDragAfterRejectedPressWithoutFocus != null) {
            if (releasedDragAfterRejectedPressWithoutFocus.listener instanceof DropListener) {
              ((DropListener) ((Object) releasedDragAfterRejectedPressWithoutFocus.listener)).onDrop((DropTargetWidget) null, releasedDragAfterRejectedPressWithoutFocus, 22176);
            }
            ValidationState.activeDragWidget = null;
          }
          if (clientControlFlowSnapshot == 0) {
            FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        pointerEventsAvailable = false;
        if (EntityCollisionSupport.heldPointerButtonSnapshot != 0) {
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == FullscreenErrorDialog.previousUiPointerButton) {
          FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, true, (UiWidget) (this), parentY, PcmResampler.pointerYSnapshot);
        releasedDragAfterPressWithoutFocus = ValidationState.activeDragWidget;
        if (releasedDragAfterPressWithoutFocus != null) {
          if (releasedDragAfterPressWithoutFocus.listener instanceof DropListener) {
            ((DropListener) ((Object) releasedDragAfterPressWithoutFocus.listener)).onDrop((DropTargetWidget) null, releasedDragAfterPressWithoutFocus, 22176);
          }
          ValidationState.activeDragWidget = null;
        }
        if ((clientControlFlowSnapshot != 0) &&
            (focusFlag != 0) &&
            (CheckboxRenderer.pointerPressButtonSnapshot != 0)) {
          this.clearKeyboardFocus(-126);
        }
        FullscreenErrorDialog.previousUiPointerButton = EntityCollisionSupport.heldPointerButtonSnapshot;
        ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
        return pointerEventsAvailable;
    }

    StringBuilder appendWidgetDiagnostics(int methodGuard, StringBuilder output, Hashtable visitedWidgets, int depth) {
        RuntimeException widgetDiagnosticFailure = null;
        StringBuilder guardedNullOutputSnapshot = null;
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
          }
          if (methodGuard == 0) {
            diagnosticOutputSnapshot = (StringBuilder) (output);
            return diagnosticOutputSnapshot;
          }
          guardedNullOutputSnapshot = (StringBuilder) null;
          return guardedNullOutputSnapshot;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("el.PA(").append(methodGuard).append(',');
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

    final void renderWidgetPassesAndTooltip(int parentY, int parentX, int firstRenderPass) {
        int lastRenderPass;
        int renderPass;
        String tooltipText;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        lastRenderPass = this.getLastRenderPass((byte) 105);
        renderPass = firstRenderPass;
        while (lastRenderPass >= renderPass) {
          this.renderWidget(parentX, parentY, (byte) 54, renderPass);
          renderPass++;
          if (clientControlFlowSnapshot == 0) {
            continue;
          }
          break;
        }
        tooltipText = LongAndTextLoginPayload.c((byte) 55);
        if (tooltipText != null) {
          DialRenderer.field_j.drawTooltip(PendingActionMarker.field_g, true, ByteTextDecodingSupport.field_a, tooltipText);
        }
    }

    void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        this.widgetHeight = height;
        this.widgetX = x;
        if (methodGuard < -6) {
            this.widgetWidth = width;
            this.widgetY = y;
            return;
        }
        this.textOffsetX = 112;
        this.widgetWidth = width;
        this.widgetY = y;
    }

    boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int guardResidue = 0;
        RuntimeException pointerPressFailure = null;
        RuntimeException pressFailureBeforeContext = null;
        StringBuilder pressFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerPressException = null;
        try {
          guardResidue = 93 % ((-3 - methodGuard) / 38);
          if (!this.containsPointer(pointerX, -1, pointerY, parentY, parentX)) {
            return false;
          }
          this.pressedPointerButton = pointerButton;
          return false;
        } catch (java.lang.RuntimeException caughtPointerPressFailure) {
          caughtPointerPressException = caughtPointerPressFailure;
          pointerPressFailure = caughtPointerPressException;
          pressFailureBeforeContext = pointerPressFailure;
          pressFailureContextBuilder = new StringBuilder().append("el.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressFailureBeforeContext), ((StringBuilder) (Object) pressFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    boolean handlePointerWheel(int parentY, int wheelRotation, int parentX, int methodGuard, int pointerX, UiWidget eventContext, int pointerY) {
        RuntimeException pointerWheelFailure = null;
        RuntimeException wheelFailureBeforeContext = null;
        StringBuilder wheelFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerWheelException = null;
        try {
          if (methodGuard != -1) {
            this.updatePointerState(false, 57, (UiWidget) null, -122);
          }
          return false;
        } catch (java.lang.RuntimeException caughtPointerWheelFailure) {
          caughtPointerWheelException = caughtPointerWheelFailure;
          pointerWheelFailure = caughtPointerWheelException;
          wheelFailureBeforeContext = pointerWheelFailure;
          wheelFailureContextBuilder = new StringBuilder().append("el.EB(").append(parentY).append(',').append(wheelRotation).append(',').append(parentX).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) wheelFailureBeforeContext), ((StringBuilder) (Object) wheelFailureContextBuilder).append(eventContextDescription).append(',').append(pointerY).append(')').toString());
        }
    }

    String getHoverText(byte methodGuard) {
        if (methodGuard == 69) {
            return !this.pointerInside ? null : this.hoverText;
        }
        this.requestKeyboardFocus((byte) -36, (UiWidget) null);
        return !this.pointerInside ? null : this.hoverText;
    }

    final void appendWidgetDiagnosticProperties(int depth, Hashtable visitedWidgets, int methodGuard, StringBuilder output) {
        StringBuilder discardedBoundsAppend = null;
        StringBuilder discardedTextAppend = null;
        StringBuilder discardedPointerInsideAppend = null;
        StringBuilder discardedFocusAppend = null;
        StringBuilder discardedRendererPrefixAppend = null;
        StringBuilder discardedRendererAppend = null;
        StringBuilder discardedListenerPrefixAppend = null;
        StringBuilder discardedListenerAppend = null;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String visitedWidgetsDescription = null;
        StringBuilder diagnosticContextAfterVisited = null;
        String outputDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        RuntimeException widgetDiagnosticFailure = null;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          discardedBoundsAppend = output.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.widgetX).append(",").append(this.widgetY).append(" ").append(this.widgetWidth).append("x").append(this.widgetHeight);
          if (this.widgetText != null) {
            discardedTextAppend = output.append(" text=\"").append(this.widgetText).append('"');
          }
          if (methodGuard != 34) {
            this.widgetX = -101;
          }
          if (this.pointerInside) {
            discardedPointerInsideAppend = output.append(" mouseover");
          }
          if (this.hasKeyboardFocus((byte) 54)) {
            discardedFocusAppend = output.append(" focused");
          }
          rendererDiagnosticFormatting: {
            if (null != this.renderer) {
              discardedRendererPrefixAppend = output.append(" renderer=");
              if (this.renderer instanceof UiWidget) {
                output = this.appendWidgetDiagnostics(0, output, visitedWidgets, 1 + depth);
                if (clientControlFlowSnapshot == 0) {
                  break rendererDiagnosticFormatting;
                }
              }
              discardedRendererAppend = output.append(this.renderer);
            }
          }
          if (null != this.listener) {
            listenerDiagnosticFormatting: {
              discardedListenerPrefixAppend = output.append(" listener=");
              if (!(this.listener instanceof UiWidget)) {
                discardedListenerAppend = output.append(this.listener);
                if (clientControlFlowSnapshot == 0) {
                  break listenerDiagnosticFormatting;
                }
              }
              output = this.appendWidgetDiagnostics(0, output, visitedWidgets, 1 + depth);
            }
          }
          return;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("el.DC(").append(depth).append(',');
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          diagnosticContextAfterVisited = ((StringBuilder) (Object) diagnosticContextBuilder).append(visitedWidgetsDescription).append(',').append(methodGuard).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterVisited).append(outputDescription).append(')').toString());
        }
    }

    void clearKeyboardFocus(int methodGuard) {
        if (methodGuard >= -122) {
            this.renderWidgetPassesAndTooltip(76, -76, 91);
        }
    }

    final static boolean readSessionBytesIfAvailable(int methodGuard, int requiredByteCount) {
        try {
            int availableOrReadByteCount = 0;
            Throwable caughtReadFailure = null;
            IOException socketReadFailure = null;
            if (LogoCompositor.sessionPacketBuffer.position >= requiredByteCount) {
              return true;
            }
            if (SpriteCheckboxRenderer.sessionSocket == null) {
              return false;
            }
            try {
              if (methodGuard != 30000) {
                UiWidget.readSessionBytesIfAvailable(-45, -75);
              }
              availableOrReadByteCount = SpriteCheckboxRenderer.sessionSocket.available((byte) 110);
              if (availableOrReadByteCount > 0) {
                if (-LogoCompositor.sessionPacketBuffer.position + requiredByteCount < availableOrReadByteCount) {
                  availableOrReadByteCount = requiredByteCount - LogoCompositor.sessionPacketBuffer.position;
                }
                SpriteCheckboxRenderer.sessionSocket.readFully(LogoCompositor.sessionPacketBuffer.bytes, (byte) -97, LogoCompositor.sessionPacketBuffer.position, availableOrReadByteCount);
                AudioService.sessionActivityStartMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
                LogoCompositor.sessionPacketBuffer.position = LogoCompositor.sessionPacketBuffer.position + availableOrReadByteCount;
                if (requiredByteCount > LogoCompositor.sessionPacketBuffer.position) {
                  return false;
                }
                LogoCompositor.sessionPacketBuffer.position = 0;
                return true;
              }
              if (availableOrReadByteCount < 0) {
                Bzip2DecoderState.closeSessionSocket((byte) -127);
              } else {
                if (GameGraphicsResources.elapsedSinceSessionActivity((byte) 12) <= 30000L) {
                  return false;
                }
                Bzip2DecoderState.closeSessionSocket((byte) -127);
              }
            } catch (java.io.IOException readFailure) {
              caughtReadFailure = readFailure;
              socketReadFailure = (IOException) (Object) caughtReadFailure;
              Bzip2DecoderState.closeSessionSocket((byte) -120);
            }
            return false;
        } catch (RuntimeException | Error uncheckedReadFailure) {
            throw uncheckedReadFailure;
        } catch (Throwable checkedReadFailure) {
            throw new RuntimeException(checkedReadFailure);
        }
    }

    final static void appendRsaXteaEncryptedBuffer(boolean methodGuard, ByteArrayBuffer source, ByteArrayBuffer destination, java.math.BigInteger rsaExponent, java.math.BigInteger rsaModulus) {
        try {
            if (methodGuard) {
                pendingByteShortQueries = (IntrusiveDeque) null;
            }
            ArchiveSource.a(rsaModulus, rsaExponent, 0, destination, source.bytes, source.position, true);
        } catch (RuntimeException encryptedBufferFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) encryptedBufferFailure), "el.WB(" + methodGuard + ',' + (source != null ? "{...}" : "null") + ',' + (destination != null ? "{...}" : "null") + ',' + (rsaExponent != null ? "{...}" : "null") + ',' + (rsaModulus != null ? "{...}" : "null") + ')');
        }
    }

    boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            this.handleKeyInput(65, 5, '￦', (UiWidget) null);
            return false;
        }
        return false;
    }

    final boolean beginWidgetDiagnosticVisit(StringBuilder output, int depth, int methodGuard, Hashtable visitedWidgets) {
        StringBuilder discardedRevisitAppend = null;
        RuntimeException widgetDiagnosticFailure = null;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String outputDescription = null;
        StringBuilder diagnosticContextAfterOutput = null;
        String visitedWidgetsDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        try {
          if (methodGuard != 10095) {
            this.listener = (WidgetListener) null;
          }
          if (visitedWidgets.containsKey(this)) {
            discardedRevisitAppend = output.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          visitedWidgets.put(this, this);
          return true;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("el.CC(");
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          diagnosticContextAfterOutput = ((StringBuilder) (Object) diagnosticContextBuilder).append(outputDescription).append(',').append(depth).append(',').append(methodGuard).append(',');
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterOutput).append(visitedWidgetsDescription).append(')').toString());
        }
    }

    final void refreshLayout(int methodGuard) {
        int guardResidue = 117 % ((-3 - methodGuard) / 63);
        this.setWidgetBounds(this.widgetHeight, this.widgetWidth, (byte) -113, this.widgetY, this.widgetX);
    }

    void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        try {
            this.pressedPointerButton = 0;
            if (!releaseGuard) {
                this.toString();
            }
        } catch (RuntimeException pointerReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerReleaseFailure), "el.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
        }
    }

    protected UiWidget() {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
    }

    UiWidget(String text, WidgetRenderer renderer, WidgetListener listener) {
        TextWidgetLayout measuringRenderer = null;
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
            this.renderer = renderer;
            this.listener = listener;
            this.widgetText = text;
            if (this.renderer instanceof TextWidgetLayout) {
                measuringRenderer = (TextWidgetLayout) ((Object) this.renderer);
                this.widgetWidth = measuringRenderer.getMaximumLineEndXWithPadding((UiWidget) (this), (byte) -33);
                this.widgetHeight = measuringRenderer.getLayoutHeightWithPadding(-122, (UiWidget) (this));
            }
        } catch (RuntimeException widgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widgetConstructionFailure), "el.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
            this.widgetWidth = width;
            this.widgetX = x;
            this.widgetHeight = height;
            this.widgetY = y;
            this.listener = listener;
            this.renderer = renderer;
        } catch (RuntimeException widgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widgetConstructionFailure), "el.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    static {
        pendingByteShortQueries = new IntrusiveDeque();
        gameplayReturnScreenId = -1;
    }
}
