/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends Widget {
    boolean enabled;
    static int field_C;
    static int[] field_J;
    private boolean focusable;
    static String field_H;
    int lastActivationButton;
    static ResourceArchive field_F;
    private boolean focused;
    boolean active;

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != IsaacRandom.field_g) {
            IsaacRandom.field_g.field_T.a(100, param1);
          }
          if (null != DequeWidgetContainer.field_C) {
            DequeWidgetContainer.field_C.field_M.a(100, param1);
          }
          if (param0 == -1) {
            return;
          }
          InteractiveWidget.i(-98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("fw.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException failure = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (!this.enabled) {
            return false;
          }
          if (!this.focusable) {
            return false;
          }
          if (obfuscationGuard != 11) {
            field_C = 102;
          }
          rootWidget.blur(1);
          this.focused = true;
          if (this.listener != null &&
            this.listener instanceof WidgetFocusListener) {
            ((WidgetFocusListener) (this.listener)).focusChanged((Widget) (this), this.focused, (byte) -41);
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fw.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(')').toString());
        }
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          super.updatePointer(obfuscationGuard + 0, originX, originY, rootWidget);
          this.lastActivationButton = 0;
          if (obfuscationGuard != 32722) {
            field_C = -124;
          }
          if (this.pressedButton != 0) {
            if (this.pressedButton == ro.pointerButton) {
              return;
            }
            if (this.containsPointer(obfuscationGuard - 32721, originX, ko.pointerY, AiPlanningStrategy.pointerX, originY) &&
              ro.pointerButton == 0) {
              this.activate(this.pressedButton, AiPlanningStrategy.pointerX - originX, ko.pointerY - originY, true);
            }
            this.pointerReleased(originY, rootWidget, AiPlanningStrategy.pointerX, (byte) -118, ko.pointerY, originX);
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fw.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    InteractiveWidget(String text, WidgetListener listener) {
        this(text, t.field_c.field_j, listener);
    }

    boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException failure = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (this.isFocused(false) && (84 == keyCode ||
            keyCode == 83)) {
            this.activate(1, -1, -1, true);
            return true;
          }
          if (obfuscationGuard == -12215) {
            return false;
          }
          field_F = (ResourceArchive) null;
          return false;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fw.F(");
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_H = null;
        field_J = null;
        if (param0 != 0) {
          return;
        }
        field_F = null;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder activeAppendResult = null;
        StringBuilder disabledAppendResult = null;
        RuntimeException failure = null;
        StringBuilder result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String builderDescription = null;
        StringBuilder errorContextWithBuilder = null;
        String tableDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (this.a(param3, param0, (byte) 106, param1)) {
            this.a(param0, param3, true, param1);
            if (this.active) {
              activeAppendResult = param1.append(" active");
            }
            if (!this.enabled) {
              disabledAppendResult = param1.append(" disabled");
            }
          }
          if (param2 != 26477) {
            this.isFocused(true);
          }
          result = (StringBuilder) (param1);
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fw.OA(").append(param0).append(',');
          if (param1 == null) {
            builderDescription = "null";
          } else {
            builderDescription = "{...}";
          }
          errorContextWithBuilder = ((StringBuilder) (Object) errorContext).append(builderDescription).append(',').append(param2).append(',');
          if (param3 == null) {
            tableDescription = "null";
          } else {
            tableDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithBuilder).append(tableDescription).append(')').toString());
        }
    }

    final boolean isFocused(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return false;
        }
        return this.focused;
    }

    void activate(int button, int pointerX, int pointerY, boolean notifyListener) {
        this.lastActivationButton = button;
        if (!notifyListener) {
          return;
        }
        if (null == this.listener) {
          return;
        }
        if (this.listener instanceof WidgetActivationListener) {
          ((WidgetActivationListener) (this.listener)).widgetActivated(pointerX, 11, button, pointerY, this);
          return;
        }
    }

    InteractiveWidget(String text, WidgetPainter painter, WidgetListener listener) {
        super(text, painter, listener);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.lastActivationButton = 0;
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        try {
          if (this.listener != null &&
            this.listener instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.listener)).pointerReleased(-110, pointerY, this, originX, originY, pointerX);
          }
          int guardRemainder = -87 % ((obfuscationGuard + 58) / 53);
          this.pressedButton = 0;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fw.JA(" + originY + ',' + (rootWidget != null ? "{...}" : "null") + ',' + pointerX + ',' + obfuscationGuard + ',' + pointerY + ',' + originX + ')');
        }
    }

    boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException failure = null;
        Widget guardWidget = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (this.enabled &&
            this.containsPointer(1, originX, pointerY, pointerX, originY)) {
            this.takeFocus(11, rootWidget);
            this.pressedButton = button;
            if (null != this.listener &&
              this.listener instanceof WidgetPointerListener) {
              ((WidgetPointerListener) (this.listener)).pointerPressed(this, originY, originX, pointerX, pointerY, button, (byte) 110);
            }
            return true;
          }
          if (obfuscationGuard > 103) {
            return false;
          }
          guardWidget = (Widget) null;
          this.pointerPressed(67, -21, 92, 52, (Widget) null, -105, -128);
          return false;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fw.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    InteractiveWidget(int x, int y, int width, int height, WidgetPainter painter, WidgetListener listener) {
        super(x, y, width, height, painter, listener);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.lastActivationButton = 0;
    }

    final void blur(int obfuscationGuard) {
        Hashtable guardTable = null;
        Hashtable unfocusedGuardTable;
        Hashtable noListenerGuardTable;
        Hashtable nonFocusListenerGuardTable;
        if (!this.focused) {
          if (obfuscationGuard == 1) {
            return;
          }
          guardTable = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        this.focused = false;
        if (null == this.listener) {
          if (obfuscationGuard == 1) {
            return;
          }
          unfocusedGuardTable = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        if (this.listener instanceof WidgetFocusListener) {
          ((WidgetFocusListener) (this.listener)).focusChanged((Widget) (this), this.focused, (byte) -41);
          if (obfuscationGuard == 1) {
            return;
          }
          noListenerGuardTable = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        if (obfuscationGuard == 1) {
          return;
        }
        nonFocusListenerGuardTable = (Hashtable) null;
        this.a(78, (StringBuilder) null, 126, (Hashtable) null);
    }

    public InteractiveWidget() {
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.lastActivationButton = 0;
        this.painter = t.field_c.field_q;
    }

    static {
        field_H = "Average rating";
    }
}
