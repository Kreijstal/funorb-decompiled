/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class UiWidget extends IntrusiveNode {
    int widgetHeight;
    int widgetWidth;
    TextLayout field_w;
    int widgetY;
    boolean pointerInside;
    String widgetText;
    static int field_t;
    WidgetRenderer renderer;
    int widgetX;
    int pressedPointerButton;
    int field_k;
    int field_n;
    WidgetListener listener;
    String hoverText;
    static IntrusiveDeque field_p;
    static int gameplayReturnScreenId;
    static GameplaySession gameplaySession;
    static int achievementTrackingAccumulator;

    final boolean a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!this.hasKeyboardFocus((byte) 54)) {
            var4 = 71 / ((param0 + 40) / 63);
            var5 = param2;
            if (var5 != 80) {
                return false;
            }
            return this.requestKeyboardFocus((byte) -75, (UiWidget) (this));
        }
        if (this.handleKeyInput(param2, 13, param1, (UiWidget) (this))) {
            return true;
        }
        var4 = 71 / ((param0 + 40) / 63);
        var5 = param2;
        if (var5 != 80) {
            return false;
        }
        return this.requestKeyboardFocus((byte) -75, (UiWidget) (this));
    }

    public static void b(int param0) {
        if (param0 != -5927) {
            return;
        }
        gameplaySession = null;
        field_p = null;
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5 = 0;
        if (renderPass != 0) {
            var5 = 35 % ((1 - methodGuard) / 43);
            return;
        }
        if (null != this.renderer) {
            this.renderer.drawWidget(parentX, -81, parentY, true, (UiWidget) (this));
            var5 = 35 % ((1 - methodGuard) / 43);
            return;
        }
        var5 = 35 % ((1 - methodGuard) / 43);
    }

    int d(byte param0) {
        if (param0 < 82) {
            field_p = (IntrusiveDeque) null;
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            return false;
          }
          this.listener = (WidgetListener) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("el.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard <= -30) {
            return false;
          }
          this.handlePointerWheel(-77, -17, -47, -88, 79, (UiWidget) null, 49);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("el.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == CachedTextLayout.wheelRotationSnapshot) {
          if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
            if ((gf.heldPointerButtonSnapshot == 0) &&
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
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          L19: {
            if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, mc.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
              if (focusFlag == 0) {
                if ((gf.heldPointerButtonSnapshot == 0) &&
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
                FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
                ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
                return pointerEventsAvailable;
              }
              this.clearKeyboardFocus(-127);
              if (clientControlFlowSnapshot == 0) {
                break L19;
              }
            }
            pointerEventsAvailable = false;
          }
          if (gf.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
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
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (focusFlag != 0) {
          this.handlePointerWheel(parentY, CachedTextLayout.wheelRotationSnapshot, parentX, -1, PrefixCodeDecoder.pointerXSnapshot, (UiWidget) (this), PcmResampler.pointerYSnapshot);
          if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
            if ((gf.heldPointerButtonSnapshot == 0) &&
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
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          L0: {
            if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, mc.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
              this.clearKeyboardFocus(-127);
              if (clientControlFlowSnapshot == 0) {
                break L0;
              }
            }
            pointerEventsAvailable = false;
          }
          if (gf.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
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
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == CheckboxRenderer.pointerPressButtonSnapshot) {
          if ((gf.heldPointerButtonSnapshot == 0) &&
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
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (!this.handlePointerPress(parentY, -109, parentX, CheckboxRenderer.pointerPressButtonSnapshot, mc.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (UiWidget) (this))) {
          if (gf.heldPointerButtonSnapshot != 0) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          if (0 == FullscreenErrorDialog.previousUiPointerButton) {
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
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
            FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
            ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
            return pointerEventsAvailable;
          }
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        pointerEventsAvailable = false;
        if (gf.heldPointerButtonSnapshot != 0) {
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
          ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
          return pointerEventsAvailable;
        }
        if (0 == FullscreenErrorDialog.previousUiPointerButton) {
          FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
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
        FullscreenErrorDialog.previousUiPointerButton = gf.heldPointerButtonSnapshot;
        ContextualRuntimeException.a(this.getHoverText((byte) 69), (byte) 72);
        return pointerEventsAvailable;
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
          }
          if (param0 == 0) {
            stackIn_6_0 = (StringBuilder) (param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("el.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Geoblox.clientControlFlowFlag;
        var4 = this.d((byte) 105);
        var5_int = param2;
        while (var4 >= var5_int) {
          this.renderWidget(param1, param0, (byte) 54, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = LongAndTextLoginPayload.c((byte) 55);
        if (var5 != null) {
          DialRenderer.field_j.a(PendingActionMarker.field_g, true, bc.field_a, var5);
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
        this.field_k = 112;
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

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.widgetX).append(",").append(this.widgetY).append(" ").append(this.widgetWidth).append("x").append(this.widgetHeight);
          if (this.widgetText != null) {
            discarded$1 = param3.append(" text=\"").append(this.widgetText).append('"');
          }
          if (param2 != 34) {
            this.widgetX = -101;
          }
          if (this.pointerInside) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.hasKeyboardFocus((byte) 54)) {
            discarded$3 = param3.append(" focused");
          }
          L4: {
            if (null != this.renderer) {
              discarded$4 = param3.append(" renderer=");
              if (this.renderer instanceof UiWidget) {
                param3 = this.a(0, param3, param1, 1 + param0);
                if (var6 == 0) {
                  break L4;
                }
              }
              discarded$5 = param3.append(this.renderer);
            }
          }
          if (null != this.listener) {
            L7: {
              discarded$6 = param3.append(" listener=");
              if (!(this.listener instanceof UiWidget)) {
                discarded$7 = param3.append(this.listener);
                if (var6 == 0) {
                  break L7;
                }
              }
              param3 = this.a(0, param3, param1, 1 + param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("el.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    void clearKeyboardFocus(int methodGuard) {
        if (methodGuard >= -122) {
            this.a(76, -76, 91);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (eh.field_d.position >= param1) {
              return true;
            }
            if (SpriteCheckboxRenderer.field_e == null) {
              return false;
            }
            try {
              if (param0 != 30000) {
                UiWidget.b(-45, -75);
              }
              var2_int = SpriteCheckboxRenderer.field_e.available((byte) 110);
              if (var2_int > 0) {
                if (-eh.field_d.position + param1 < var2_int) {
                  var2_int = param1 - eh.field_d.position;
                }
                SpriteCheckboxRenderer.field_e.readFully(eh.field_d.bytes, (byte) -97, eh.field_d.position, var2_int);
                AudioService.field_e = oa.a(-12520);
                eh.field_d.position = eh.field_d.position + var2_int;
                if (param1 > eh.field_d.position) {
                  return false;
                }
                eh.field_d.position = 0;
                return true;
              }
              if (var2_int < 0) {
                Bzip2DecoderState.closeSessionSocket((byte) -127);
              } else {
                if (ll.a((byte) 12) <= 30000L) {
                  return false;
                }
                Bzip2DecoderState.closeSessionSocket((byte) -127);
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              Bzip2DecoderState.closeSessionSocket((byte) -120);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, ByteArrayBuffer param1, ByteArrayBuffer param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            if (param0) {
                field_p = (IntrusiveDeque) null;
            }
            ArchiveSource.a(param4, param3, 0, param2, param1.bytes, param1.position, true);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "el.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            this.handleKeyInput(65, 5, '￦', (UiWidget) null);
            return false;
        }
        return false;
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10095) {
            this.listener = (WidgetListener) null;
          }
          if (param3.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("el.CC(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
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
        this.field_k = 0;
        this.field_n = 0;
    }

    UiWidget(String text, WidgetRenderer renderer, WidgetListener listener) {
        TextWidgetLayout measuringRenderer = null;
        this.field_k = 0;
        this.field_n = 0;
        try {
            this.renderer = renderer;
            this.listener = listener;
            this.widgetText = text;
            if (this.renderer instanceof TextWidgetLayout) {
                measuringRenderer = (TextWidgetLayout) ((Object) this.renderer);
                this.widgetWidth = measuringRenderer.a((UiWidget) (this), (byte) -33);
                this.widgetHeight = measuringRenderer.a(-122, (UiWidget) (this));
            }
        } catch (RuntimeException widgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widgetConstructionFailure), "el.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        this.field_k = 0;
        this.field_n = 0;
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
        field_p = new IntrusiveDeque();
        gameplayReturnScreenId = -1;
    }
}
