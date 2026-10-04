/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements ChildWidgetOwner {
    static String toServerListText;
    static Sprite menuBackgroundSprite;
    IntrusiveDeque children;
    static String[] mustLogin2Texts;
    static int[] themeCycleOrder;

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        DequeCursor childCursor = null;
        RuntimeException pointerPressFailure = null;
        UiWidget child = null;
        int guardQuotient = 0;
        int clientControlFlowSnapshot = 0;
        RuntimeException pressFailureForContext = null;
        StringBuilder pressContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPressFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (child != null) {
            if (child.isLinked(118)) {
              if (child.handlePointerPress(parentY + this.widgetY, 60, this.widgetX + parentX, pointerButton, pointerX, pointerY, eventContext)) {
                return true;
              }
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 109));
              continue;
            }
            break;
          }
          guardQuotient = -13 / ((-3 - methodGuard) / 38);
          return false;
        } catch (java.lang.RuntimeException pressFailure) {
          caughtPressFailure = pressFailure;
          pointerPressFailure = caughtPressFailure;
          pressFailureForContext = pointerPressFailure;
          pressContextBuilder = new StringBuilder().append("ee.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressFailureForContext), ((StringBuilder) (Object) pressContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(int methodGuard, StringBuilder output, Hashtable visitedWidgets, int depth) {
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
          if (methodGuard != 0) {
            guardedNullOutputSnapshot = (StringBuilder) null;
            return guardedNullOutputSnapshot;
          }
          if (this.beginWidgetDiagnosticVisit(output, depth, 10095, visitedWidgets)) {
            this.appendWidgetDiagnosticProperties(depth, visitedWidgets, 34, output);
            this.appendChildrenDiagnostics(visitedWidgets, output, -3188, depth);
          }
          diagnosticOutputSnapshot = (StringBuilder) (output);
          return diagnosticOutputSnapshot;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("ee.PA(").append(methodGuard).append(',');
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

    final int getLastRenderPass(byte methodGuard) {
        int childLastRenderPass = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        int lastRenderPass = 0;
        DequeCursor childCursor = new DequeCursor(this.children);
        UiWidget child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
        if (methodGuard < 82) {
            toServerListText = (String) null;
        }
        while (child != null) {
            childLastRenderPass = child.getLastRenderPass((byte) 91);
            if (lastRenderPass < childLastRenderPass) {
                lastRenderPass = childLastRenderPass;
            }
            child = (UiWidget) ((Object) childCursor.nextForward((byte) 110));
        }
        return lastRenderPass;
    }

    final boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            StringBuilder guardedNullBuilderSnapshot = (StringBuilder) null;
            this.appendChildrenDiagnostics((Hashtable) null, (StringBuilder) null, -120, -15);
        }
        return null != this.findFocusTarget((byte) -99) ? true : false;
    }

    final boolean requestPreviousChildFocus(int methodGuard, UiWidget focusContext) {
        RuntimeException focusSearchFailure = null;
        UiWidget focusedChildCandidate = null;
        DequeCursor candidateCursor = null;
        UiWidget focusCandidate = null;
        int clientControlFlowSnapshot = 0;
        DequeCursor focusedChildCursor = null;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (this.children.isEmpty(13519)) {
            return false;
          }
          focusedChildCursor = new DequeCursor(this.children);
          focusedChildCandidate = (UiWidget) ((Object) focusedChildCursor.beginReverse(1));
          if (methodGuard != 7305) {
            themeCycleOrder = (int[]) null;
          }
          while (focusedChildCandidate != null) {
            if (focusedChildCandidate.hasKeyboardFocus((byte) 54)) {
              candidateCursor = new DequeCursor(this.children);
              candidateCursor.beginReverseAt(focusedChildCandidate, (byte) 123);
              focusCandidate = (UiWidget) ((Object) candidateCursor.nextReverse(26));
              while ((focusCandidate != null)) {
                if (!focusCandidate.requestKeyboardFocus((byte) -39, focusContext)) {
                  focusCandidate = (UiWidget) ((Object) candidateCursor.nextReverse(26));
                  continue;
                }
                return true;
              }
            }
            focusedChildCandidate = (UiWidget) ((Object) focusedChildCursor.nextReverse(26));
          }
          return false;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          focusSearchFailure = caughtFocusFailure;
          focusFailureForContext = focusSearchFailure;
          focusContextBuilder = new StringBuilder().append("ee.AB(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(')').toString());
        }
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        RuntimeException pointerStateFailure = null;
        DequeCursor childCursor = null;
        UiWidget child = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException pointerFailureForContext = null;
        StringBuilder pointerContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          childCursor = new DequeCursor(this.children);
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (child != null) {
            if (child.isLinked(122)) {
              child.updatePointerState(false, this.widgetY + parentY, eventContext, this.widgetX + parentX);
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 123));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException pointerFailure) {
          caughtPointerFailure = pointerFailure;
          pointerStateFailure = caughtPointerFailure;
          pointerFailureForContext = pointerStateFailure;
          pointerContextBuilder = new StringBuilder().append("ee.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerFailureForContext), ((StringBuilder) (Object) pointerContextBuilder).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if ((renderPass == 0) &&
            ((this.renderer != null))) {
            this.renderer.drawWidget(parentX, -9, parentY, true, (UiWidget) (this));
        }
        int guardResidue = -58 % ((methodGuard - 1) / 43);
        DequeCursor childCursor = new DequeCursor(this.children);
        UiWidget child = (UiWidget) ((Object) childCursor.beginReverse(1));
        while (child != null) {
            child.renderWidget(this.widgetX + parentX, parentY + this.widgetY, (byte) 93, renderPass);
            child = (UiWidget) ((Object) childCursor.nextReverse(26));
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 14078) {
            return;
        }
        mustLogin2Texts = null;
        toServerListText = null;
        themeCycleOrder = null;
        menuBackgroundSprite = null;
    }

    final String getHoverText(byte methodGuard) {
        DequeCursor childCursor;
        UiWidget child;
        String childHoverText;
        childCursor = new DequeCursor(this.children);
        if (methodGuard != 69) {
          menuBackgroundSprite = (Sprite) null;
        }
        child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
        while (child != null) {
          childHoverText = child.getHoverText((byte) 69);
          if (childHoverText != null) {
            return childHoverText;
          }
          child = (UiWidget) ((Object) childCursor.nextForward((byte) 111));
        }
        return null;
    }

    private final void refreshChildrenLayout(byte methodGuard) {
        DequeCursor childCursor = new DequeCursor(this.children);
        UiWidget child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
        while (child != null) {
            child.refreshLayout(116);
            child = (UiWidget) ((Object) childCursor.nextForward((byte) 108));
        }
        int guardResidue = 71 / ((methodGuard - 57) / 51);
    }

    final boolean requestNextChildFocus(UiWidget focusContext, int methodGuard) {
        DequeCursor focusedChildCursor = null;
        RuntimeException focusSearchFailure = null;
        UiWidget focusedChildCandidate = null;
        DequeCursor candidateCursor = null;
        UiWidget focusCandidate = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (this.children.isEmpty(13519)) {
            return false;
          }
          focusedChildCursor = new DequeCursor(this.children);
          if (methodGuard > -75) {
            return true;
          }
          focusedChildCandidate = (UiWidget) ((Object) focusedChildCursor.beginForward((byte) 88));
          while (focusedChildCandidate != null) {
            if (focusedChildCandidate.hasKeyboardFocus((byte) 54)) {
              candidateCursor = new DequeCursor(this.children);
              candidateCursor.beginForwardAt((byte) 56, focusedChildCandidate);
              focusCandidate = (UiWidget) ((Object) candidateCursor.nextForward((byte) 114));
              while ((focusCandidate != null)) {
                if (!focusCandidate.requestKeyboardFocus((byte) -56, focusContext)) {
                  focusCandidate = (UiWidget) ((Object) candidateCursor.nextForward((byte) 114));
                  continue;
                }
                return true;
              }
            }
            focusedChildCandidate = (UiWidget) ((Object) focusedChildCursor.nextForward((byte) 109));
          }
          return false;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          focusSearchFailure = caughtFocusFailure;
          focusFailureForContext = focusSearchFailure;
          focusContextBuilder = new StringBuilder().append("ee.RA(");
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor childCursor = new DequeCursor(this.children);
        if (methodGuard > -122) {
            themeCycleOrder = (int[]) null;
        }
        UiWidget child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
        while (child != null) {
            child.clearKeyboardFocus(-126);
            child = (UiWidget) ((Object) childCursor.nextForward((byte) 121));
        }
    }

    WidgetContainer(int x, int y, int width, int height, WidgetRenderer renderer) {
        super(x, y, width, height, renderer, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        DequeCursor childCursor = null;
        RuntimeException childFocusRequestFailure = null;
        UiWidget child = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          if (methodGuard >= -30) {
            return false;
          }
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (true) {
            if (child == null) {
              return false;
            }
            if (!child.requestKeyboardFocus((byte) -123, focusContext)) {
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 125));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          childFocusRequestFailure = caughtFocusFailure;
          focusFailureForContext = childFocusRequestFailure;
          focusContextBuilder = new StringBuilder().append("ee.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(')').toString());
        }
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        super.setWidgetBounds(height, width, (byte) -21, y, x);
        if (methodGuard >= -6) {
            this.getHoverText((byte) 85);
        }
        this.refreshChildrenLayout((byte) 123);
    }

    final void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        DequeCursor childCursor = null;
        UiWidget child = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException releaseFailureForContext = null;
        StringBuilder releaseContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtReleaseFailure = null;
        RuntimeException pointerReleaseFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (child != null) {
            if (child.isLinked(122)) {
              child.handlePointerRelease(parentX + this.widgetX, pointerX, true, eventContext, this.widgetY + parentY, pointerY);
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 109));
              continue;
            }
            break;
          }
          if (!releaseGuard) {
            this.getHoverText((byte) -6);
          }
          return;
        } catch (java.lang.RuntimeException releaseFailure) {
          caughtReleaseFailure = releaseFailure;
          pointerReleaseFailure = caughtReleaseFailure;
          releaseFailureForContext = pointerReleaseFailure;
          releaseContextBuilder = new StringBuilder().append("ee.TA(").append(parentX).append(',').append(pointerX).append(',').append(releaseGuard).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) releaseFailureForContext), ((StringBuilder) (Object) releaseContextBuilder).append(eventContextDescription).append(',').append(parentY).append(',').append(pointerY).append(')').toString());
        }
    }

    boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyInputFailure = null;
        int keyCodeSnapshot = 0;
        int clientControlFlowSnapshot = 0;
        UiWidget child = null;
        DequeCursor childCursor = null;
        boolean childFocusRequested = false;
        RuntimeException keyFailureForContext = null;
        StringBuilder keyContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          if (methodGuard != 13) {
            this.clearKeyboardFocus(-77);
          }
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (child != null) {
            if (child.isLinked(120)) {
              if ((child.hasKeyboardFocus((byte) 54)) &&
                  (child.handleKeyInput(keyCode, 13, typedCharacter, eventContext))) {
                return true;
              }
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 110));
              continue;
            }
            break;
          }
          keyCodeSnapshot = keyCode;
          if (keyCodeSnapshot != 80) {
            return false;
          }
          if (!MidiPcmStream.heldInternalKeys[81]) {
            childFocusRequested = this.requestNextChildFocus(eventContext, -96);
          } else {
            childFocusRequested = this.requestPreviousChildFocus(7305, eventContext);
          }
          return childFocusRequested;
        } catch (java.lang.RuntimeException keyFailure) {
          caughtKeyFailure = keyFailure;
          keyInputFailure = caughtKeyFailure;
          keyFailureForContext = keyInputFailure;
          keyContextBuilder = new StringBuilder().append("ee.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureForContext), ((StringBuilder) (Object) keyContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    private final void appendChildrenDiagnostics(Hashtable visitedWidgets, StringBuilder output, int methodGuard, int depth) {
        StringBuilder discardedNewlineAppend = null;
        int indentIndex = 0;
        StringBuilder discardedIndentAppend = null;
        UiWidget child = null;
        int clientControlFlowSnapshot = 0;
        UiWidget guardedNullChildSnapshot = null;
        DequeCursor childCursor = null;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String visitedWidgetsDescription = null;
        StringBuilder diagnosticContextAfterVisited = null;
        String outputDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        RuntimeException childrenDiagnosticFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          if (methodGuard != -3188) {
            guardedNullChildSnapshot = (UiWidget) null;
            this.updatePointerState(true, 26, (UiWidget) null, 23);
          }
          while (child != null) {
            discardedNewlineAppend = output.append('\n');
            for (indentIndex = 0; depth >= indentIndex; indentIndex++) {
              discardedIndentAppend = output.append(' ');
            }
            child.appendWidgetDiagnostics(0, output, visitedWidgets, depth + 1);
            child = (UiWidget) ((Object) childCursor.nextForward((byte) 125));
          }
          return;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          childrenDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = childrenDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("ee.FB(");
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          diagnosticContextAfterVisited = ((StringBuilder) (Object) diagnosticContextBuilder).append(visitedWidgetsDescription).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterVisited).append(outputDescription).append(',').append(methodGuard).append(',').append(depth).append(')').toString());
        }
    }

    UiWidget findFocusTarget(byte methodGuard) {
        DequeCursor childCursor;
        UiWidget child;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard >= -60) {
          toServerListText = (String) null;
        }
        childCursor = new DequeCursor(this.children);
        child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
        while (child != null) {
          if (child.hasKeyboardFocus((byte) 54)) {
            return child;
          }
          child = (UiWidget) ((Object) childCursor.nextForward((byte) 121));
        }
        return null;
    }

    final void addChild(byte methodGuard, UiWidget child) {
        try {
            this.children.addLast(-113, child);
            if (methodGuard >= -60) {
                menuBackgroundSprite = (Sprite) null;
            }
        } catch (RuntimeException childInsertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) childInsertionFailure), "ee.OA(" + methodGuard + ',' + (child != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handlePointerWheel(int parentY, int wheelRotation, int parentX, int methodGuard, int pointerX, UiWidget eventContext, int pointerY) {
        RuntimeException pointerWheelFailure = null;
        UiWidget child = null;
        int clientControlFlowSnapshot = 0;
        DequeCursor childCursor = null;
        RuntimeException wheelFailureForContext = null;
        StringBuilder wheelContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtWheelFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          childCursor = new DequeCursor(this.children);
          if (methodGuard != -1) {
            this.setWidgetBounds(-119, -117, (byte) 87, 105, 63);
          }
          child = (UiWidget) ((Object) childCursor.beginForward((byte) 88));
          while (child != null) {
            if (child.isLinked(127)) {
              if ((child.hasKeyboardFocus((byte) 54)) &&
                  (child.handlePointerWheel(parentY, wheelRotation, parentX, methodGuard + 0, pointerX, eventContext, pointerY))) {
                return true;
              }
              child = (UiWidget) ((Object) childCursor.nextForward((byte) 124));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException wheelFailure) {
          caughtWheelFailure = wheelFailure;
          pointerWheelFailure = caughtWheelFailure;
          wheelFailureForContext = pointerWheelFailure;
          wheelContextBuilder = new StringBuilder().append("ee.EB(").append(parentY).append(',').append(wheelRotation).append(',').append(parentX).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) wheelFailureForContext), ((StringBuilder) (Object) wheelContextBuilder).append(eventContextDescription).append(',').append(pointerY).append(')').toString());
        }
    }

    static {
        toServerListText = "To server list";
        mustLogin2Texts = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        themeCycleOrder = new int[]{1, 2, 0, 3, 6, 5, 4};
    }
}
