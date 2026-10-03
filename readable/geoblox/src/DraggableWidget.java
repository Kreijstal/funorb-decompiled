/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int grabOffsetX;
    private boolean childPressTakesPriority;
    static hh contentFadeOutPhase;
    private int layoutTargetY;
    private int layoutTargetX;
    private boolean easeToLayoutPosition;
    private int grabOffsetY;
    static hh contentResizePhase;

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
            dragTargetY = -this.grabOffsetY + (ue.pointerYSnapshot - parentY);
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
          dragFailureBeforeContext = (RuntimeException) (dragUpdateFailure);
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

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            this.b(param3, param1, param2, param0 + 0);
            discarded$70 = param1.append(" revert=").append(this.easeToLayoutPosition);
            if ((this.layoutTargetX != 2147483647) &&
                (this.layoutTargetY != 2147483647)) {
              discarded$71 = param1.append(" to ").append(this.layoutTargetX).append(',').append(this.layoutTargetY);
            }
          }
          if (param0 != 0) {
            contentResizePhase = (hh) null;
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var5);
          stackIn_11_1 = new StringBuilder().append("la.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
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
          lh.activeDragWidget = (DraggableWidget) (this);
          return true;
        } catch (java.lang.RuntimeException caughtDragPressFailure) {
          caughtDragPressException = caughtDragPressFailure;
          dragPressFailure = caughtDragPressException;
          dragPressFailureBeforeContext = (RuntimeException) (dragPressFailure);
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
            fh.b(-6011);
            ii.field_a = true;
            cf.field_i = true;
            kd.field_e.hideAllDialogs(param0 + 10912);
            fa.showMessageDialog(ah.connectionLostReconnectingText, 480, false);
            return;
        }
        DraggableWidget.g((byte) 86);
        fh.b(-6011);
        ii.field_a = true;
        cf.field_i = true;
        kd.field_e.hideAllDialogs(param0 + 10912);
        fa.showMessageDialog(ah.connectionLostReconnectingText, 480, false);
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
        contentFadeOutPhase = new hh();
        contentResizePhase = new hh();
    }
}
