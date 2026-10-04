/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int grabOffsetX;
    private boolean childPressTakesPriority;
    static UiFontResources contentFadeOutPhase;
    private int layoutTargetY;
    private int layoutTargetX;
    private boolean easeToLayoutPosition;
    private int grabOffsetY;
    static UiFontResources contentResizePhase;

    final void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        try {
            super.handlePointerRelease(parentX, pointerX, releaseGuard, eventContext, parentY, pointerY);
            this.pressedPointerButton = 0;
        } catch (RuntimeException dragReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dragReleaseFailure), "la.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int xBeforeEasing = 0;
        int xEasingStep = 0;
        int yBeforeEasing = 0;
        int yEasingStep = 0;
        RuntimeException dragFailureBeforeContext = null;
        StringBuilder dragFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtDragUpdateException = null;
        int dragTargetXOrLayoutDelta = 0;
        RuntimeException dragUpdateFailure = null;
        int dragTargetY = 0;
        try {
          if ((!((this.child instanceof ButtonWidget) &&
                (!((ButtonWidget) ((Object) this.child)).enabled))) &&
              (this.pressedPointerButton == 1)) {
            dragTargetXOrLayoutDelta = PrefixCodeDecoder.pointerXSnapshot - this.grabOffsetX - parentX;
            dragTargetY = -this.grabOffsetY + (PcmResampler.pointerYSnapshot - parentY);
            if (!((this.widgetX == dragTargetXOrLayoutDelta) &&
                (dragTargetY == this.widgetY))) {
              this.widgetY = dragTargetY;
              this.widgetX = dragTargetXOrLayoutDelta;
              if (!(!(this.listener instanceof DragMovementListener))) {
                ((DragMovementListener) ((Object) this.listener)).onDragMoved(parentX, -20951, (DraggableWidget) (this), parentY);
              }
            }
          } else {
            if (this.easeToLayoutPosition) {
              if (this.layoutTargetX != this.widgetX) {
                dragTargetXOrLayoutDelta = this.layoutTargetX - this.widgetX;
                xBeforeEasing = this.widgetX;
                if (Math.abs(dragTargetXOrLayoutDelta) > 2) {
                  xEasingStep = dragTargetXOrLayoutDelta >> 1;
                } else {
                  if (0 >= dragTargetXOrLayoutDelta) {
                    xEasingStep = -1;
                  } else {
                    xEasingStep = 1;
                  }
                }
                ((DraggableWidget) (this)).widgetX = xBeforeEasing + xEasingStep;
              }
              if (this.widgetY != this.layoutTargetY) {
                dragTargetXOrLayoutDelta = this.layoutTargetY - this.widgetY;
                yBeforeEasing = this.widgetY;
                if (Math.abs(dragTargetXOrLayoutDelta) <= 2) {
                  if (dragTargetXOrLayoutDelta > 0) {
                    yEasingStep = 1;
                  } else {
                    yEasingStep = -1;
                  }
                } else {
                  yEasingStep = dragTargetXOrLayoutDelta >> 1;
                }
                ((DraggableWidget) (this)).widgetY = yBeforeEasing + yEasingStep;
              }
            }
          }
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          if (!hoverGuard) {
            return;
          }
          this.layoutTargetY = 54;
          return;
        } catch (java.lang.RuntimeException caughtDragUpdateFailure) {
          caughtDragUpdateException = caughtDragUpdateFailure;
          dragUpdateFailure = caughtDragUpdateException;
          dragFailureBeforeContext = dragUpdateFailure;
          dragFailureContextBuilder = new StringBuilder().append("la.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dragFailureBeforeContext), ((StringBuilder) (Object) dragFailureContextBuilder).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    private DraggableWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener, UiWidget child, boolean easeToLayoutPosition, boolean childPressTakesPriority) {
        super(x, y, width, height, renderer, listener);
        this.layoutTargetY = 2147483647;
        this.layoutTargetX = 2147483647;
        try {
            this.child = child;
            this.easeToLayoutPosition = easeToLayoutPosition ? true : false;
            this.childPressTakesPriority = childPressTakesPriority ? true : false;
        } catch (RuntimeException dragWidgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dragWidgetConstructionFailure), "la.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ',' + easeToLayoutPosition + ',' + childPressTakesPriority + ')');
        }
    }

    final StringBuilder appendWidgetDiagnostics(int methodGuard, StringBuilder output, Hashtable visitedWidgets, int depth) {
        StringBuilder discardedRevertAppend = null;
        StringBuilder discardedTargetPositionAppend = null;
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
            this.appendChildDiagnostics(depth, output, visitedWidgets, methodGuard + 0);
            discardedRevertAppend = output.append(" revert=").append(this.easeToLayoutPosition);
            if ((this.layoutTargetX != 2147483647) &&
                (this.layoutTargetY != 2147483647)) {
              discardedTargetPositionAppend = output.append(" to ").append(this.layoutTargetX).append(',').append(this.layoutTargetY);
            }
          }
          if (methodGuard != 0) {
            contentResizePhase = (UiFontResources) null;
          }
          diagnosticOutputSnapshot = (StringBuilder) (output);
          return diagnosticOutputSnapshot;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("la.PA(").append(methodGuard).append(',');
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

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int childHandledFlag = 0;
        RuntimeException dragPressFailure = null;
        int guardResidue = 0;
        int childHandledBeforeReturn = 0;
        RuntimeException dragPressFailureBeforeContext = null;
        StringBuilder dragPressFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtDragPressException = null;
        try {
          childHandledFlag = super.handlePointerPress(parentY, 53, parentX, pointerButton, pointerX, pointerY, eventContext) ? 1 : 0;
          guardResidue = 5 % ((-3 - methodGuard) / 38);
          if ((childHandledFlag != 0) &&
              (this.childPressTakesPriority)) {
            return true;
          }
          if (!this.containsPointer(pointerX, -1, pointerY, parentY, parentX)) {
            childHandledBeforeReturn = childHandledFlag;
            return childHandledBeforeReturn != 0;
          }
          this.pressedPointerButton = pointerButton;
          if (pointerButton != 1) {
            return true;
          }
          this.grabOffsetY = -parentY + pointerY - this.widgetY;
          this.grabOffsetX = -parentX + (pointerX - this.widgetX);
          ValidationState.activeDragWidget = (DraggableWidget) (this);
          return true;
        } catch (java.lang.RuntimeException caughtDragPressFailure) {
          caughtDragPressException = caughtDragPressFailure;
          dragPressFailure = caughtDragPressException;
          dragPressFailureBeforeContext = dragPressFailure;
          dragPressFailureContextBuilder = new StringBuilder().append("la.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dragPressFailureBeforeContext), ((StringBuilder) (Object) dragPressFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    final static void f(byte param0) {
        if (param0 == 24) {
            UnderlinedButtonRenderer.b(-6011);
            ArchiveLoadStep.field_a = true;
            AgeValidator.reconnectingLoginMode = true;
            ClientFlowState.accountDialogLayer.hideAllDialogs(param0 + 10912);
            MessageDialogSupport.showMessageDialog(TextWidgetSupport.connectionLostReconnectingText, 480, false);
            return;
        }
        DraggableWidget.g((byte) 86);
        UnderlinedButtonRenderer.b(-6011);
        ArchiveLoadStep.field_a = true;
        AgeValidator.reconnectingLoginMode = true;
        ClientFlowState.accountDialogLayer.hideAllDialogs(param0 + 10912);
        MessageDialogSupport.showMessageDialog(TextWidgetSupport.connectionLostReconnectingText, 480, false);
    }

    final void refreshChildLayout(boolean layoutGuard) {
        super.refreshChildLayout(layoutGuard);
        this.child.setWidgetBounds(this.widgetHeight, this.widgetWidth, (byte) -85, 0, 0);
        this.layoutTargetX = this.widgetX;
        this.layoutTargetY = this.widgetY;
    }

    public static void g(byte param0) {
        int var1 = 47 % ((param0 + 51) / 55);
        contentResizePhase = null;
        contentFadeOutPhase = null;
    }

    static {
        contentFadeOutPhase = new UiFontResources();
        contentResizePhase = new UiFontResources();
    }
}
