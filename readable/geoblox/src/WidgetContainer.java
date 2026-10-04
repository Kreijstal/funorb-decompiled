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
        DequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9_ref_el = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          var8 = new DequeCursor(this.children);
          var9_ref_el = (UiWidget) ((Object) var8.beginForward((byte) 88));
          while (var9_ref_el != null) {
            if (var9_ref_el.isLinked(118)) {
              if (var9_ref_el.handlePointerPress(parentY + this.widgetY, 60, this.widgetX + parentX, pointerButton, pointerX, pointerY, eventContext)) {
                return true;
              }
              var9_ref_el = (UiWidget) ((Object) var8.nextForward((byte) 109));
              continue;
            }
            break;
          }
          var9 = -13 / ((-3 - methodGuard) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = var8_ref;
          stackIn_13_1 = new StringBuilder().append("ee.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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

    final boolean a(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        DequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        DequeCursor var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (this.children.isEmpty(13519)) {
            return false;
          }
          var8 = new DequeCursor(this.children);
          var4 = (UiWidget) ((Object) var8.beginReverse(1));
          if (param0 != 7305) {
            themeCycleOrder = (int[]) null;
          }
          while (var4 != null) {
            if (var4.hasKeyboardFocus((byte) 54)) {
              var5 = new DequeCursor(this.children);
              var5.beginReverseAt(var4, (byte) 123);
              var6 = (UiWidget) ((Object) var5.nextReverse(26));
              while (!(var6 == null)) {
                if (!var6.requestKeyboardFocus((byte) -39, param1)) {
                  var6 = (UiWidget) ((Object) var5.nextReverse(26));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) ((Object) var8.nextReverse(26));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ee.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        RuntimeException runtimeException = null;
        DequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          var5 = new DequeCursor(this.children);
          var6 = (UiWidget) ((Object) var5.beginForward((byte) 88));
          while (var6 != null) {
            if (var6.isLinked(122)) {
              var6.updatePointerState(false, this.widgetY + parentY, eventContext, this.widgetX + parentX);
              var6 = (UiWidget) ((Object) var5.nextForward((byte) 123));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ee.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(parentX).append(')').toString());
        }
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var8 = Geoblox.clientControlFlowFlag;
        if ((renderPass == 0) &&
            (!(this.renderer == null))) {
            this.renderer.drawWidget(parentX, -9, parentY, true, (UiWidget) (this));
        }
        int var6 = -58 % ((methodGuard - 1) / 43);
        DequeCursor var5 = new DequeCursor(this.children);
        UiWidget var7 = (UiWidget) ((Object) var5.beginReverse(1));
        while (var7 != null) {
            var7.renderWidget(this.widgetX + parentX, parentY + this.widgetY, (byte) 93, renderPass);
            var7 = (UiWidget) ((Object) var5.nextReverse(26));
        }
    }

    public static void e(int param0) {
        if (param0 != 14078) {
            return;
        }
        mustLogin2Texts = null;
        toServerListText = null;
        themeCycleOrder = null;
        menuBackgroundSprite = null;
    }

    final String getHoverText(byte methodGuard) {
        DequeCursor var2;
        UiWidget var3;
        String var4;
        var2 = new DequeCursor(this.children);
        if (methodGuard != 69) {
          menuBackgroundSprite = (Sprite) null;
        }
        var3 = (UiWidget) ((Object) var2.beginForward((byte) 88));
        while (var3 != null) {
          var4 = var3.getHoverText((byte) 69);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) ((Object) var2.nextForward((byte) 111));
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

    final boolean a(UiWidget param0, int param1) {
        DequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        DequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (this.children.isEmpty(13519)) {
            return false;
          }
          var3 = new DequeCursor(this.children);
          if (param1 > -75) {
            return true;
          }
          var4 = (UiWidget) ((Object) var3.beginForward((byte) 88));
          while (var4 != null) {
            if (var4.hasKeyboardFocus((byte) 54)) {
              var5 = new DequeCursor(this.children);
              var5.beginForwardAt((byte) 56, var4);
              var6 = (UiWidget) ((Object) var5.nextForward((byte) 114));
              while (!(var6 == null)) {
                if (!var6.requestKeyboardFocus((byte) -56, param0)) {
                  var6 = (UiWidget) ((Object) var5.nextForward((byte) 114));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) ((Object) var3.nextForward((byte) 109));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("ee.RA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int methodGuard) {
        int var4 = Geoblox.clientControlFlowFlag;
        DequeCursor var2 = new DequeCursor(this.children);
        if (methodGuard > -122) {
            themeCycleOrder = (int[]) null;
        }
        UiWidget var3 = (UiWidget) ((Object) var2.beginForward((byte) 88));
        while (var3 != null) {
            var3.clearKeyboardFocus(-126);
            var3 = (UiWidget) ((Object) var2.nextForward((byte) 121));
        }
    }

    WidgetContainer(int x, int y, int width, int height, WidgetRenderer renderer) {
        super(x, y, width, height, renderer, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        DequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          var3 = new DequeCursor(this.children);
          if (methodGuard >= -30) {
            return false;
          }
          var4 = (UiWidget) ((Object) var3.beginForward((byte) 88));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.requestKeyboardFocus((byte) -123, focusContext)) {
              var4 = (UiWidget) ((Object) var3.nextForward((byte) 125));
              continue;
            }
            return true;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ee.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
        DequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Geoblox.clientControlFlowFlag;
        try {
          var7 = new DequeCursor(this.children);
          var8 = (UiWidget) ((Object) var7.beginForward((byte) 88));
          while (var8 != null) {
            if (var8.isLinked(122)) {
              var8.handlePointerRelease(parentX + this.widgetX, pointerX, true, eventContext, this.widgetY + parentY, pointerY);
              var8 = (UiWidget) ((Object) var7.nextForward((byte) 109));
              continue;
            }
            break;
          }
          if (!releaseGuard) {
            this.getHoverText((byte) -6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("ee.TA(").append(parentX).append(',').append(pointerX).append(',').append(releaseGuard).append(',');
          if (eventContext == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(parentY).append(',').append(pointerY).append(')').toString());
        }
    }

    boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        DequeCursor var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          var9 = new DequeCursor(this.children);
          if (param1 != 13) {
            this.clearKeyboardFocus(-77);
          }
          var8 = (UiWidget) ((Object) var9.beginForward((byte) 88));
          while (var8 != null) {
            if (var8.isLinked(120)) {
              if ((var8.hasKeyboardFocus((byte) 54)) &&
                  (var8.handleKeyInput(param0, 13, param2, param3))) {
                return true;
              }
              var8 = (UiWidget) ((Object) var9.nextForward((byte) 110));
              continue;
            }
            break;
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (!MidiPcmStream.heldInternalKeys[81]) {
            stackIn_17_0 = this.a(param3, -96);
          } else {
            stackIn_17_0 = this.a(7305, param3);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ee.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
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
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        DequeCursor var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          var11 = new DequeCursor(this.children);
          if (methodGuard != -1) {
            this.setWidgetBounds(-119, -117, (byte) 87, 105, 63);
          }
          var9 = (UiWidget) ((Object) var11.beginForward((byte) 88));
          while (var9 != null) {
            if (var9.isLinked(127)) {
              if ((var9.hasKeyboardFocus((byte) 54)) &&
                  (var9.handlePointerWheel(parentY, wheelRotation, parentX, methodGuard + 0, pointerX, eventContext, pointerY))) {
                return true;
              }
              var9 = (UiWidget) ((Object) var11.nextForward((byte) 124));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ee.EB(").append(parentY).append(',').append(wheelRotation).append(',').append(parentX).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (eventContext == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(pointerY).append(')').toString());
        }
    }

    static {
        toServerListText = "To server list";
        mustLogin2Texts = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        themeCycleOrder = new int[]{1, 2, 0, 3, 6, 5, 4};
    }
}
